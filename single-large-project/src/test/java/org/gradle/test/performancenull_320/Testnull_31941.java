package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31941 {
    private final Productionnull_31941 production = new Productionnull_31941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}