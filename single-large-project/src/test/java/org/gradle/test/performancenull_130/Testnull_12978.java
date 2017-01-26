package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12978 {
    private final Productionnull_12978 production = new Productionnull_12978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}