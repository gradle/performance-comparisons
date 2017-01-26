package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6364 {
    private final Productionnull_6364 production = new Productionnull_6364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}