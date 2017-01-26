package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4004 {
    private final Productionnull_4004 production = new Productionnull_4004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}