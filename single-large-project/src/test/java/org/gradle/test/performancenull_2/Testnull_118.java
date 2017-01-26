package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_118 {
    private final Productionnull_118 production = new Productionnull_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}