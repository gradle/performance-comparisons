package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47491 {
    private final Productionnull_47491 production = new Productionnull_47491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}