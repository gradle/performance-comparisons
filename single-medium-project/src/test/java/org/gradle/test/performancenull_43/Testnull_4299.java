package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4299 {
    private final Productionnull_4299 production = new Productionnull_4299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}