package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5982 {
    private final Productionnull_5982 production = new Productionnull_5982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}