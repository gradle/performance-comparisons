package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42007 {
    private final Productionnull_42007 production = new Productionnull_42007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}