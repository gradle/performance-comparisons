package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18129 {
    private final Productionnull_18129 production = new Productionnull_18129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}