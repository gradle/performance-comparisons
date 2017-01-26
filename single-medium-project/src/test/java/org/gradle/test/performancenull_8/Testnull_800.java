package org.gradle.test.performancenull_8;

import static org.junit.Assert.*;

public class Testnull_800 {
    private final Productionnull_800 production = new Productionnull_800("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}