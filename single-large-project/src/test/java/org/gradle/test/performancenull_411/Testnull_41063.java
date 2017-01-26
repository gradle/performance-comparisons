package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41063 {
    private final Productionnull_41063 production = new Productionnull_41063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}