package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3800 {
    private final Productionnull_3800 production = new Productionnull_3800("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}