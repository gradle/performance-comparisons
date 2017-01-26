package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11441 {
    private final Productionnull_11441 production = new Productionnull_11441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}