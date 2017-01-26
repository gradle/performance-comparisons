package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12972 {
    private final Productionnull_12972 production = new Productionnull_12972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}