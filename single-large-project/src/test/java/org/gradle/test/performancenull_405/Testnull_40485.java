package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40485 {
    private final Productionnull_40485 production = new Productionnull_40485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}