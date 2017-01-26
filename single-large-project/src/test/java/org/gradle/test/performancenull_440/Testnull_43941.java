package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43941 {
    private final Productionnull_43941 production = new Productionnull_43941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}