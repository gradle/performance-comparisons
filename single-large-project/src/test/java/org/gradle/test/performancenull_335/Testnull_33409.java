package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33409 {
    private final Productionnull_33409 production = new Productionnull_33409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}