package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1490 {
    private final Productionnull_1490 production = new Productionnull_1490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}