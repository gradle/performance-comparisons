package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47500 {
    private final Productionnull_47500 production = new Productionnull_47500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}