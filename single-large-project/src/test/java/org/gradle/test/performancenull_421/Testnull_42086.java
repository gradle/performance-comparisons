package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42086 {
    private final Productionnull_42086 production = new Productionnull_42086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}