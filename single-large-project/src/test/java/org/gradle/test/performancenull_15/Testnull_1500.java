package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1500 {
    private final Productionnull_1500 production = new Productionnull_1500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}