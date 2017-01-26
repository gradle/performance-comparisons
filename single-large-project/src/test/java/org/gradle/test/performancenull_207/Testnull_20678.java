package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20678 {
    private final Productionnull_20678 production = new Productionnull_20678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}