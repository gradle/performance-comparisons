package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1050 {
    private final Productionnull_1050 production = new Productionnull_1050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}