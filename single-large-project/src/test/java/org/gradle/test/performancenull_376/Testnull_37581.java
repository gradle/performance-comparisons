package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37581 {
    private final Productionnull_37581 production = new Productionnull_37581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}