package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_278 {
    private final Productionnull_278 production = new Productionnull_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}