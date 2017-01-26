package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45354 {
    private final Productionnull_45354 production = new Productionnull_45354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}