package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2054 {
    private final Productionnull_2054 production = new Productionnull_2054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}