package org.gradle.test.performancenull_151;

import static org.junit.Assert.*;

public class Testnull_15075 {
    private final Productionnull_15075 production = new Productionnull_15075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}