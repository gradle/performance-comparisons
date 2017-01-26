package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21706 {
    private final Productionnull_21706 production = new Productionnull_21706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}