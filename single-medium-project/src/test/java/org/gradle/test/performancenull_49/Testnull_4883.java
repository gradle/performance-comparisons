package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4883 {
    private final Productionnull_4883 production = new Productionnull_4883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}