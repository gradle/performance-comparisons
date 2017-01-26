package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18306 {
    private final Productionnull_18306 production = new Productionnull_18306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}