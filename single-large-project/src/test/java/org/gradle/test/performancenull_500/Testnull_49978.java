package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49978 {
    private final Productionnull_49978 production = new Productionnull_49978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}