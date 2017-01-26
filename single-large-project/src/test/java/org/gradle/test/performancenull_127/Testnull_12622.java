package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12622 {
    private final Productionnull_12622 production = new Productionnull_12622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}