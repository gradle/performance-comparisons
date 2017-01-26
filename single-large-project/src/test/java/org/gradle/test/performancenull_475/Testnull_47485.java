package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47485 {
    private final Productionnull_47485 production = new Productionnull_47485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}