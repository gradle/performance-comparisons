package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6485 {
    private final Productionnull_6485 production = new Productionnull_6485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}