package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18442 {
    private final Productionnull_18442 production = new Productionnull_18442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}