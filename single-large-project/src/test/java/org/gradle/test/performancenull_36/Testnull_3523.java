package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3523 {
    private final Productionnull_3523 production = new Productionnull_3523("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}