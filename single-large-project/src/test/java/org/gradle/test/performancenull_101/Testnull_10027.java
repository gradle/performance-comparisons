package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10027 {
    private final Productionnull_10027 production = new Productionnull_10027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}