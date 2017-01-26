package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18050 {
    private final Productionnull_18050 production = new Productionnull_18050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}