package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21632 {
    private final Productionnull_21632 production = new Productionnull_21632("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}