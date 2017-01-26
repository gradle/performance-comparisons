package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12963 {
    private final Productionnull_12963 production = new Productionnull_12963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}