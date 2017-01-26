package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4915 {
    private final Productionnull_4915 production = new Productionnull_4915("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}