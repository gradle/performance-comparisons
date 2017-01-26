package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1228 {
    private final Productionnull_1228 production = new Productionnull_1228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}