package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41062 {
    private final Productionnull_41062 production = new Productionnull_41062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}