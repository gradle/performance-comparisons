package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40243 {
    private final Productionnull_40243 production = new Productionnull_40243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}