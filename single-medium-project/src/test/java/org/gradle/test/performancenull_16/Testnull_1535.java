package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1535 {
    private final Productionnull_1535 production = new Productionnull_1535("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}