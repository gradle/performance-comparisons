package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3001 {
    private final Productionnull_3001 production = new Productionnull_3001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}