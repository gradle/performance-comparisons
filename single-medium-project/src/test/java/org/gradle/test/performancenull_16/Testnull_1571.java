package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1571 {
    private final Productionnull_1571 production = new Productionnull_1571("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}