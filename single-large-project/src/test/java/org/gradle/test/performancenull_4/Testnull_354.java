package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_354 {
    private final Productionnull_354 production = new Productionnull_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}