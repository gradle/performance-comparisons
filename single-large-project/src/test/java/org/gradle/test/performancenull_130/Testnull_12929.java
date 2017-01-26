package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12929 {
    private final Productionnull_12929 production = new Productionnull_12929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}