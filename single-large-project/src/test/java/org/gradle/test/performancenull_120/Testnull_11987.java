package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11987 {
    private final Productionnull_11987 production = new Productionnull_11987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}