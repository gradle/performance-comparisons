package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11096 {
    private final Productionnull_11096 production = new Productionnull_11096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}