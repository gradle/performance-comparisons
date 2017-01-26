package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_13000 {
    private final Productionnull_13000 production = new Productionnull_13000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}