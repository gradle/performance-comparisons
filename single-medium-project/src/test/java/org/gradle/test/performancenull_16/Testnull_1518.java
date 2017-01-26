package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1518 {
    private final Productionnull_1518 production = new Productionnull_1518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}