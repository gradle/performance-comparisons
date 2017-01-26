package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42004 {
    private final Productionnull_42004 production = new Productionnull_42004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}