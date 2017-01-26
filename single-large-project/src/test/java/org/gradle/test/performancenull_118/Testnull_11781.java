package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11781 {
    private final Productionnull_11781 production = new Productionnull_11781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}