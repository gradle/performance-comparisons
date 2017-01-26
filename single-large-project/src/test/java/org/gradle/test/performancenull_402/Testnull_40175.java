package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40175 {
    private final Productionnull_40175 production = new Productionnull_40175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}