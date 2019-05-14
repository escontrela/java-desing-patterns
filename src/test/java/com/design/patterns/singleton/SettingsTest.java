package com.design.patterns.singleton;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


/**
 * Singleton pattern demoed
 */
public class SettingsTest {

    public static final Logger logger = LoggerFactory.getLogger(SettingsTest.class);

    @Test
    @DisplayName("Creates a setting class unique instance")
    @Tag("SingletonPattern")
    public void thisTestShouldCreateAUniqueInstanceOfSettingsClass(){

        Settings appSettings = Settings.getInstance();
        Settings appSettings2 = Settings.getInstance();

        logger.info("Number of items: {} , instance 2: {} "
                , appSettings.getMaxNumberOfShopCartItems(),appSettings2.getMaxNumberOfShopCartItems());

        assertAll("singleton",

                () ->  assertTrue(appSettings == appSettings2)
        );
    }

}