package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45373 {
    private final Productionnull_45373 production = new Productionnull_45373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}