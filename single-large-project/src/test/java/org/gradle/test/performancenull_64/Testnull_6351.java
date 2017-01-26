package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6351 {
    private final Productionnull_6351 production = new Productionnull_6351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}