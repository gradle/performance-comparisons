package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47462 {
    private final Productionnull_47462 production = new Productionnull_47462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}