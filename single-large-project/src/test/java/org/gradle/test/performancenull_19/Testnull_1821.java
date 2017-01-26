package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1821 {
    private final Productionnull_1821 production = new Productionnull_1821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}