package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21793 {
    private final Productionnull_21793 production = new Productionnull_21793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}