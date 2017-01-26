package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47455 {
    private final Productionnull_47455 production = new Productionnull_47455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}