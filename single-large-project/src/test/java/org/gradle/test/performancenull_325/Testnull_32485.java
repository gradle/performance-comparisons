package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32485 {
    private final Productionnull_32485 production = new Productionnull_32485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}