package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4050 {
    private final Productionnull_4050 production = new Productionnull_4050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}