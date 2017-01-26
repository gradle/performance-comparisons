package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28421 {
    private final Productionnull_28421 production = new Productionnull_28421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}