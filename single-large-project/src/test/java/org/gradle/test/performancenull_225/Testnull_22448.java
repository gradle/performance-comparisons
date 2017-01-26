package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22448 {
    private final Productionnull_22448 production = new Productionnull_22448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}