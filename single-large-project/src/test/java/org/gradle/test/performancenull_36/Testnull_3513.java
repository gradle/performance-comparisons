package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3513 {
    private final Productionnull_3513 production = new Productionnull_3513("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}