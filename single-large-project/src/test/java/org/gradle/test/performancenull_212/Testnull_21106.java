package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21106 {
    private final Productionnull_21106 production = new Productionnull_21106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}