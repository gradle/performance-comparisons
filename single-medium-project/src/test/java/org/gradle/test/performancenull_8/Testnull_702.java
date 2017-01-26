package org.gradle.test.performancenull_8;

import static org.junit.Assert.*;

public class Testnull_702 {
    private final Productionnull_702 production = new Productionnull_702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}