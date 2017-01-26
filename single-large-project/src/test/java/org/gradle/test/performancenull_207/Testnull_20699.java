package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20699 {
    private final Productionnull_20699 production = new Productionnull_20699("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}