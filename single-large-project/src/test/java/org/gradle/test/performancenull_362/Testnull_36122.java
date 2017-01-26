package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36122 {
    private final Productionnull_36122 production = new Productionnull_36122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}