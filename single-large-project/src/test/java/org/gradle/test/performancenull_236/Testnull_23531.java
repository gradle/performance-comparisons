package org.gradle.test.performancenull_236;

import static org.junit.Assert.*;

public class Testnull_23531 {
    private final Productionnull_23531 production = new Productionnull_23531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}