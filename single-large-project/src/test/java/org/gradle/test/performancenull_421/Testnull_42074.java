package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42074 {
    private final Productionnull_42074 production = new Productionnull_42074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}