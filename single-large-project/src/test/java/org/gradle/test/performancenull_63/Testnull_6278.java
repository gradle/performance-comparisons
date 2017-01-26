package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6278 {
    private final Productionnull_6278 production = new Productionnull_6278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}