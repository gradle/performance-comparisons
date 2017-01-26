package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1492 {
    private final Productionnull_1492 production = new Productionnull_1492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}