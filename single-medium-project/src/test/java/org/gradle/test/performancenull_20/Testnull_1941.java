package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1941 {
    private final Productionnull_1941 production = new Productionnull_1941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}