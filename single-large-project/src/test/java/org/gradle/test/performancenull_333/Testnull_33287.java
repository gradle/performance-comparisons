package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33287 {
    private final Productionnull_33287 production = new Productionnull_33287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}