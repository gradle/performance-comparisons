package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1302 {
    private final Productionnull_1302 production = new Productionnull_1302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}