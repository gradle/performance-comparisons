package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34169 {
    private final Productionnull_34169 production = new Productionnull_34169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}