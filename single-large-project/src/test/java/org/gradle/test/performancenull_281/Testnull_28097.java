package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28097 {
    private final Productionnull_28097 production = new Productionnull_28097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}