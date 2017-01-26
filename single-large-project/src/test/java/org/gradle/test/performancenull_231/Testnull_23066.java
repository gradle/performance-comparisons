package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23066 {
    private final Productionnull_23066 production = new Productionnull_23066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}