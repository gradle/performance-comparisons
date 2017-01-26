package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20340 {
    private final Productionnull_20340 production = new Productionnull_20340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}