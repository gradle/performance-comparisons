package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31951 {
    private final Productionnull_31951 production = new Productionnull_31951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}