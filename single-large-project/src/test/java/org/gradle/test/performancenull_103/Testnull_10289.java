package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10289 {
    private final Productionnull_10289 production = new Productionnull_10289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}