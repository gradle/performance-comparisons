package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41086 {
    private final Productionnull_41086 production = new Productionnull_41086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}