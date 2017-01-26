package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32005 {
    private final Productionnull_32005 production = new Productionnull_32005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}