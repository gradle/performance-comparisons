package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21149 {
    private final Productionnull_21149 production = new Productionnull_21149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}