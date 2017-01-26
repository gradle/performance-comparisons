package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_17000 {
    private final Productionnull_17000 production = new Productionnull_17000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}