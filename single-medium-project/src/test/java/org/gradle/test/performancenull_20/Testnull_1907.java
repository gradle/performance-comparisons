package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1907 {
    private final Productionnull_1907 production = new Productionnull_1907("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}