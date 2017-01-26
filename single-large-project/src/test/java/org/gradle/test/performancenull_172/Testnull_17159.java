package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17159 {
    private final Productionnull_17159 production = new Productionnull_17159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}