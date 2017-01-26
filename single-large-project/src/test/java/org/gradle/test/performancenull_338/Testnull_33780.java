package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33780 {
    private final Productionnull_33780 production = new Productionnull_33780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}