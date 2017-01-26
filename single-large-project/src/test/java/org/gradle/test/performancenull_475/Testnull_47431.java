package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47431 {
    private final Productionnull_47431 production = new Productionnull_47431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}