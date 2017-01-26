package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23360 {
    private final Productionnull_23360 production = new Productionnull_23360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}