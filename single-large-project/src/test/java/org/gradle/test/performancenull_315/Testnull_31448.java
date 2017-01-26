package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31448 {
    private final Productionnull_31448 production = new Productionnull_31448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}