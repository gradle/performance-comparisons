package org.gradle.test.performancenull_122;

import static org.junit.Assert.*;

public class Testnull_12154 {
    private final Productionnull_12154 production = new Productionnull_12154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}