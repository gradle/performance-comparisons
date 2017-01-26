package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32402 {
    private final Productionnull_32402 production = new Productionnull_32402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}