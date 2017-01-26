package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40821 {
    private final Productionnull_40821 production = new Productionnull_40821("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}