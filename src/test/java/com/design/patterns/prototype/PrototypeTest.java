package com.design.patterns.prototype;

import com.design.patterns.prototype.model.CustomerAddress;
import com.design.patterns.singleton.SettingsTest;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class PrototypeTest {


    @Test
    @DisplayName("Creates a copy of a customer address")
    @Tag("PrototypePattern")
    public void thisTestShouldCreateAPrototypeOfACustomerAddress() throws CloneNotSupportedException {


        CustomerAddress address =
                    new CustomerAddress("David","P","address","city","MA","91","ES");

        CustomerAddress addressClone = address.copy();


        assertAll("prototype",

                () ->  assertTrue(address != addressClone)
        );
    }


}
