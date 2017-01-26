package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2800 {
    private final Productionnull_2800 production = new Productionnull_2800("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}