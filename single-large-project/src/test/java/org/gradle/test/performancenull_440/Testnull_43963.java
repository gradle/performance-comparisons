package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43963 {
    private final Productionnull_43963 production = new Productionnull_43963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}