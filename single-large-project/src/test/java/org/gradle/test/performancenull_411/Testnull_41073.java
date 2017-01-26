package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41073 {
    private final Productionnull_41073 production = new Productionnull_41073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}