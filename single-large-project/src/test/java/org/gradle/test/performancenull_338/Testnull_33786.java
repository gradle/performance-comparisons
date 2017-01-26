package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33786 {
    private final Productionnull_33786 production = new Productionnull_33786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}