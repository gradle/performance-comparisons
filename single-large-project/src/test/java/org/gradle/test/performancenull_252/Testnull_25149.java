package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25149 {
    private final Productionnull_25149 production = new Productionnull_25149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}