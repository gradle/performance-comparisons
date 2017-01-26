package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1545 {
    private final Productionnull_1545 production = new Productionnull_1545("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}