package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21695 {
    private final Productionnull_21695 production = new Productionnull_21695("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}