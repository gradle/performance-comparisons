package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21187 {
    private final Productionnull_21187 production = new Productionnull_21187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}