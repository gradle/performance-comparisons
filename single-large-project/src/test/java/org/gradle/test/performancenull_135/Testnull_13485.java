package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13485 {
    private final Productionnull_13485 production = new Productionnull_13485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}