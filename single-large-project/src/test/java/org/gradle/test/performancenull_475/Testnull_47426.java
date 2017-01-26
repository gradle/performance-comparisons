package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47426 {
    private final Productionnull_47426 production = new Productionnull_47426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}