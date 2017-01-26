package org.gradle.test.performancenull_475;

import static org.junit.Assert.*;

public class Testnull_47465 {
    private final Productionnull_47465 production = new Productionnull_47465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}