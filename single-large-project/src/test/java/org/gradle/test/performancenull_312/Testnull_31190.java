package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31190 {
    private final Productionnull_31190 production = new Productionnull_31190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}