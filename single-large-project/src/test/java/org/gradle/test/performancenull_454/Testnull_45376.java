package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45376 {
    private final Productionnull_45376 production = new Productionnull_45376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}