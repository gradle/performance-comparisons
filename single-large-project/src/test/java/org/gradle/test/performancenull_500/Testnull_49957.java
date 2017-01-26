package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49957 {
    private final Productionnull_49957 production = new Productionnull_49957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}