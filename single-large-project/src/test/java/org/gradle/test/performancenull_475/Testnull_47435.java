package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47435 {
    private final Productionnull_47435 production = new Productionnull_47435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}