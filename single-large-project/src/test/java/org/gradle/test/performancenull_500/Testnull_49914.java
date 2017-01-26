package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49914 {
    private final Productionnull_49914 production = new Productionnull_49914("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}