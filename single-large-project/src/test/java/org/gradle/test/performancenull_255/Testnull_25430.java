package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25430 {
    private final Productionnull_25430 production = new Productionnull_25430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}