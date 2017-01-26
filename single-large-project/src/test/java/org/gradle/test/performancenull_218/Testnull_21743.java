package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21743 {
    private final Productionnull_21743 production = new Productionnull_21743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}