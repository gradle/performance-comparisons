package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17973 {
    private final Productionnull_17973 production = new Productionnull_17973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}