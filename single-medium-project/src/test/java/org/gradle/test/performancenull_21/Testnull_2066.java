package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2066 {
    private final Productionnull_2066 production = new Productionnull_2066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}