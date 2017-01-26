package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4201 {
    private final Productionnull_4201 production = new Productionnull_4201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}