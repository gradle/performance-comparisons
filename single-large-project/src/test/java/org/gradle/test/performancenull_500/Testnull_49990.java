package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49990 {
    private final Productionnull_49990 production = new Productionnull_49990("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}