package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22096 {
    private final Productionnull_22096 production = new Productionnull_22096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}