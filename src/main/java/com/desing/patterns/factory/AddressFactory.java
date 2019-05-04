package com.desing.patterns.factory;

import com.desing.patterns.factory.model.AddressBuilder;
import com.desing.patterns.factory.model.BillingAddress;
import com.desing.patterns.factory.model.ShippingAddress;
import java.util.function.Supplier;

/**
 * Address factory based on a static method and a enumeration
 **/
public class AddressFactory {

    public  enum AddressType {

        BILLING(

                (AddressBuilder step) -> {

                    return
                            new BillingAddress(

                                    step.getFirstName(),
                                    step.getLastName(),
                                    step.getAddressLine(),
                                    step.getCity(),
                                    step.getState(),
                                    step.getZipCode(),
                                    step.getCountry(),
                                    step.getVatNumber()
                            );

                }
        ),
        SHIPPING(
                (AddressBuilder step) -> {

                   return
                            new ShippingAddress(

                                    step.getFirstName(),
                                    step.getLastName(),
                                    step.getAddressLine(),
                                    step.getCity(),
                                    step.getState(),
                                    step.getZipCode(),
                                    step.getCountry()
                            );
                }
        );

        AddressType(AddressConstructor s) {

            constructor = s;
        }

        private final AddressConstructor constructor;

        public AddressConstructor getConstructor() {

            return constructor;
        }
    }

    @FunctionalInterface
    private interface AddressConstructor<T> {

        T create(AddressBuilder step);
    }

    public static <T> T create(AddressType type,  AddressBuilder step) {

            return (T) type.getConstructor().create(step);

    }

    public static <T> T create(AddressType type, Supplier<AddressBuilder> steps) {

        return (T) type.getConstructor().create(steps.get());
    }

    public static void main(String args[]) {

        Supplier<AddressBuilder> WithSpanishAleatoryCreator = new Supplier<AddressBuilder>() {
            @Override
            public AddressBuilder get() {

                return new AddressBuilder();
            }
        };

        BillingAddress address = create(AddressType.BILLING, WithSpanishAleatoryCreator);
        System.out.println("Addresss:" + address);
    }
}