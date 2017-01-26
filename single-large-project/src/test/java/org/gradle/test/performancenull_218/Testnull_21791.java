package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21791 {
    private final Productionnull_21791 production = new Productionnull_21791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}