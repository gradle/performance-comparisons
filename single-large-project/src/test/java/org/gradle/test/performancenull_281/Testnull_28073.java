package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28073 {
    private final Productionnull_28073 production = new Productionnull_28073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}