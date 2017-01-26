package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35490 {
    private final Productionnull_35490 production = new Productionnull_35490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}