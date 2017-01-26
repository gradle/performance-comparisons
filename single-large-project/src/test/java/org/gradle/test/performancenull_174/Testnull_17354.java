package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17354 {
    private final Productionnull_17354 production = new Productionnull_17354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}