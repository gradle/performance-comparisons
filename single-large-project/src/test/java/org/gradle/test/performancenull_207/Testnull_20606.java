package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20606 {
    private final Productionnull_20606 production = new Productionnull_20606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}