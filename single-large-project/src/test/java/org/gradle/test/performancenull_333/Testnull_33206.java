package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33206 {
    private final Productionnull_33206 production = new Productionnull_33206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}