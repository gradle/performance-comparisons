package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21199 {
    private final Productionnull_21199 production = new Productionnull_21199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}