package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33266 {
    private final Productionnull_33266 production = new Productionnull_33266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}