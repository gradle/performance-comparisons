package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2490 {
    private final Productionnull_2490 production = new Productionnull_2490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}