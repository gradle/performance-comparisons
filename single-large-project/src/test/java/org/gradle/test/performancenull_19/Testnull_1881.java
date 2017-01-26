package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1881 {
    private final Productionnull_1881 production = new Productionnull_1881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}