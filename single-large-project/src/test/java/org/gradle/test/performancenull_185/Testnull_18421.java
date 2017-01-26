package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18421 {
    private final Productionnull_18421 production = new Productionnull_18421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}