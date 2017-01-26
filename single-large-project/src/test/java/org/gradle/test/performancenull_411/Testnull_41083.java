package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41083 {
    private final Productionnull_41083 production = new Productionnull_41083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}