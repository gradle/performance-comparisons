package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20533 {
    private final Productionnull_20533 production = new Productionnull_20533("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}