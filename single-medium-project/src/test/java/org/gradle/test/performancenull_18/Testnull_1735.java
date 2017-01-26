package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1735 {
    private final Productionnull_1735 production = new Productionnull_1735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}