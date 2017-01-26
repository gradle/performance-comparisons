package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2248 {
    private final Productionnull_2248 production = new Productionnull_2248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}