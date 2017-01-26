package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33278 {
    private final Productionnull_33278 production = new Productionnull_33278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}