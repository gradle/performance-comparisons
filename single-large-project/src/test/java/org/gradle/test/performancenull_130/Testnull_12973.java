package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12973 {
    private final Productionnull_12973 production = new Productionnull_12973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}