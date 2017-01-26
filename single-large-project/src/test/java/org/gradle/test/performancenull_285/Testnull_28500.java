package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28500 {
    private final Productionnull_28500 production = new Productionnull_28500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}