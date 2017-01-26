package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3029 {
    private final Productionnull_3029 production = new Productionnull_3029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}