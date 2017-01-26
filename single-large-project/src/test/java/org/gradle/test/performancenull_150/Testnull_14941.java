package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14941 {
    private final Productionnull_14941 production = new Productionnull_14941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}