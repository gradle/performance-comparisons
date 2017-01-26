package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7448 {
    private final Productionnull_7448 production = new Productionnull_7448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}