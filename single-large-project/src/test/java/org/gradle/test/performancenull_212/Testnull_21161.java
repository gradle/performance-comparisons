package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21161 {
    private final Productionnull_21161 production = new Productionnull_21161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}