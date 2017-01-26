package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42265 {
    private final Productionnull_42265 production = new Productionnull_42265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}