package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17050 {
    private final Productionnull_17050 production = new Productionnull_17050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}