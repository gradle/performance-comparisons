package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18637 {
    private final Productionnull_18637 production = new Productionnull_18637("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}