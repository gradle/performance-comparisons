package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6327 {
    private final Productionnull_6327 production = new Productionnull_6327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}