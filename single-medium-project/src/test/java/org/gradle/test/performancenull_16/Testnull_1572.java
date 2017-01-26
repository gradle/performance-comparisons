package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1572 {
    private final Productionnull_1572 production = new Productionnull_1572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}