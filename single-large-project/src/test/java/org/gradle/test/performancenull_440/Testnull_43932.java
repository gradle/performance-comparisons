package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43932 {
    private final Productionnull_43932 production = new Productionnull_43932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}