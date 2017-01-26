package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23074 {
    private final Productionnull_23074 production = new Productionnull_23074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}