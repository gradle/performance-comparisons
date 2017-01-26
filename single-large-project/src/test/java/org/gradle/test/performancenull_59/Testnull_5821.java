package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5821 {
    private final Productionnull_5821 production = new Productionnull_5821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}