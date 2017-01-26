package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36178 {
    private final Productionnull_36178 production = new Productionnull_36178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}