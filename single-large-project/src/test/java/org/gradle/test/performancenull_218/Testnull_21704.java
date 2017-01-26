package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21704 {
    private final Productionnull_21704 production = new Productionnull_21704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}