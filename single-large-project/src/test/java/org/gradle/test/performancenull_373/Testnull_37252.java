package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37252 {
    private final Productionnull_37252 production = new Productionnull_37252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}