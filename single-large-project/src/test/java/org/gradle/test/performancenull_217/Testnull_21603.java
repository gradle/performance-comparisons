package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21603 {
    private final Productionnull_21603 production = new Productionnull_21603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}