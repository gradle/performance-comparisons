package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49821 {
    private final Productionnull_49821 production = new Productionnull_49821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}