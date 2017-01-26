package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47441 {
    private final Productionnull_47441 production = new Productionnull_47441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}