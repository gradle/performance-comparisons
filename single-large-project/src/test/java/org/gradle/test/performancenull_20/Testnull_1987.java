package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1987 {
    private final Productionnull_1987 production = new Productionnull_1987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}