package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21739 {
    private final Productionnull_21739 production = new Productionnull_21739("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}