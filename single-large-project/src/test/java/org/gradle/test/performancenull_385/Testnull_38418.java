package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38418 {
    private final Productionnull_38418 production = new Productionnull_38418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}