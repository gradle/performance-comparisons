package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11942 {
    private final Productionnull_11942 production = new Productionnull_11942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}