package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27083 {
    private final Productionnull_27083 production = new Productionnull_27083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}