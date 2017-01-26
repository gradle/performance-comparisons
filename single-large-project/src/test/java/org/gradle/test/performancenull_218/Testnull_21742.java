package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21742 {
    private final Productionnull_21742 production = new Productionnull_21742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}