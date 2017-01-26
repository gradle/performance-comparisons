package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21671 {
    private final Productionnull_21671 production = new Productionnull_21671("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}