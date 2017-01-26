package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37278 {
    private final Productionnull_37278 production = new Productionnull_37278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}