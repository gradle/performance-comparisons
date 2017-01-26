package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25916 {
    private final Productionnull_25916 production = new Productionnull_25916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}