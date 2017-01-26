package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21679 {
    private final Productionnull_21679 production = new Productionnull_21679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}