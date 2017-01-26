package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5048 {
    private final Productionnull_5048 production = new Productionnull_5048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}