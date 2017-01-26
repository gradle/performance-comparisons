package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40148 {
    private final Productionnull_40148 production = new Productionnull_40148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}