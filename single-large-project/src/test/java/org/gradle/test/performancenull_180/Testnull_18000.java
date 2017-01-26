package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_18000 {
    private final Productionnull_18000 production = new Productionnull_18000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}