package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21163 {
    private final Productionnull_21163 production = new Productionnull_21163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}