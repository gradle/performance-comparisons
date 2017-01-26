package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1577 {
    private final Productionnull_1577 production = new Productionnull_1577("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}