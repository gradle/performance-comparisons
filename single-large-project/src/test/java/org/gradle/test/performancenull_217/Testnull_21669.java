package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21669 {
    private final Productionnull_21669 production = new Productionnull_21669("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}