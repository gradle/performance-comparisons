package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1579 {
    private final Productionnull_1579 production = new Productionnull_1579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}