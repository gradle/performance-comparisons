package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21738 {
    private final Productionnull_21738 production = new Productionnull_21738("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}