package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7954 {
    private final Productionnull_7954 production = new Productionnull_7954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}