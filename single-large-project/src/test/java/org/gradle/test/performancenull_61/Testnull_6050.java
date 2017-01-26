package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6050 {
    private final Productionnull_6050 production = new Productionnull_6050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}