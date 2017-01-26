package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37242 {
    private final Productionnull_37242 production = new Productionnull_37242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}