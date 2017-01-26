package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42916 {
    private final Productionnull_42916 production = new Productionnull_42916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}