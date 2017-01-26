package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28492 {
    private final Productionnull_28492 production = new Productionnull_28492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}