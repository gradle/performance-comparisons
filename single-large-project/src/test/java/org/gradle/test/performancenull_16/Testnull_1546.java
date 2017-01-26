package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1546 {
    private final Productionnull_1546 production = new Productionnull_1546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}