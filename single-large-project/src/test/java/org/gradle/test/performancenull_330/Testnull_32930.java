package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32930 {
    private final Productionnull_32930 production = new Productionnull_32930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}