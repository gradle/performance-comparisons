package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1932 {
    private final Productionnull_1932 production = new Productionnull_1932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}