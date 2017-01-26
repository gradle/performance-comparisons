package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25154 {
    private final Productionnull_25154 production = new Productionnull_25154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}