package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20365 {
    private final Productionnull_20365 production = new Productionnull_20365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}