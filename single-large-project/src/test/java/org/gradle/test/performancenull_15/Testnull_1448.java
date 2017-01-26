package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1448 {
    private final Productionnull_1448 production = new Productionnull_1448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}