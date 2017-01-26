package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21066 {
    private final Productionnull_21066 production = new Productionnull_21066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}