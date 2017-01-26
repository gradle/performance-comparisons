package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11265 {
    private final Productionnull_11265 production = new Productionnull_11265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}