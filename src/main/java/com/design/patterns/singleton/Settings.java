package com.design.patterns.singleton;


/**
 * singleton pattern (GoF creational)
 *
 * Restricts the instantiation of a class to one object on the same JVM.
 * The same instance is used along the different threads
 * Useful when exactly one object is needed do things across the system.
 */
public class Settings {

    protected static volatile  Settings INSTANCE;

    /**
     * Thread safe double check locking implementation
     * @return unique Settings instance
     */
    public static Settings getInstance(){

        if (INSTANCE == null){

            synchronized (Settings.class){
                if (INSTANCE == null){

                    INSTANCE = new Settings();
                }
            }

        }

        return INSTANCE;
    }

    private Settings(){

    }

    /**
     * @return Max number of items allowed on the shopping cart
     */
    public Integer getMaxNumberOfShopCartItems(){

        return Integer.valueOf(50);
    }
}
