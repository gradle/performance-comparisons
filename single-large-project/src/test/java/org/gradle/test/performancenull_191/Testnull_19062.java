package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19062 {
    private final Productionnull_19062 production = new Productionnull_19062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}