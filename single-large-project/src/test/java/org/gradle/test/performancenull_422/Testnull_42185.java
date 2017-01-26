package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42185 {
    private final Productionnull_42185 production = new Productionnull_42185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}