package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18623 {
    private final Productionnull_18623 production = new Productionnull_18623("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}