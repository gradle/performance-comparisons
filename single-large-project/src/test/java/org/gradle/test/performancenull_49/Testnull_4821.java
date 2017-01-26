package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4821 {
    private final Productionnull_4821 production = new Productionnull_4821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}