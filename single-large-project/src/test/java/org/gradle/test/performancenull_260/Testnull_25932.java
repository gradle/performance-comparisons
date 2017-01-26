package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25932 {
    private final Productionnull_25932 production = new Productionnull_25932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}