package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1173 {
    private final Productionnull_1173 production = new Productionnull_1173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}