package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6360 {
    private final Productionnull_6360 production = new Productionnull_6360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}