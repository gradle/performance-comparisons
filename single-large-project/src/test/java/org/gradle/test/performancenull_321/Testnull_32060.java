package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32060 {
    private final Productionnull_32060 production = new Productionnull_32060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}