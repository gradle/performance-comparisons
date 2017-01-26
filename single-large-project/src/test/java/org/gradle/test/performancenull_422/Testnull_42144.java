package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42144 {
    private final Productionnull_42144 production = new Productionnull_42144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}