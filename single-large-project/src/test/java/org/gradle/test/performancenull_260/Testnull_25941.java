package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25941 {
    private final Productionnull_25941 production = new Productionnull_25941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}