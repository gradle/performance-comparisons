package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5074 {
    private final Productionnull_5074 production = new Productionnull_5074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}