package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_50000 {
    private final Productionnull_50000 production = new Productionnull_50000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}