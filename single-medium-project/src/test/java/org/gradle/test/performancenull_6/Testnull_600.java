package org.gradle.test.performancenull_6;

import static org.junit.Assert.*;

public class Testnull_600 {
    private final Productionnull_600 production = new Productionnull_600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}