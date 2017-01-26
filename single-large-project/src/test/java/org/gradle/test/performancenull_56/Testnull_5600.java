package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5600 {
    private final Productionnull_5600 production = new Productionnull_5600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}