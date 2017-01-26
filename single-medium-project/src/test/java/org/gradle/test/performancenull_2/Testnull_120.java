package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_120 {
    private final Productionnull_120 production = new Productionnull_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}