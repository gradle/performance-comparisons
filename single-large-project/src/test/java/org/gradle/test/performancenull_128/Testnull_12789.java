package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12789 {
    private final Productionnull_12789 production = new Productionnull_12789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}