package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33236 {
    private final Productionnull_33236 production = new Productionnull_33236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}