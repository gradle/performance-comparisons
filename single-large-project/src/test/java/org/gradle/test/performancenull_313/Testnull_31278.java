package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31278 {
    private final Productionnull_31278 production = new Productionnull_31278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}