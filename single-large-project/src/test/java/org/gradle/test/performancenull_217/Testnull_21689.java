package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21689 {
    private final Productionnull_21689 production = new Productionnull_21689("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}