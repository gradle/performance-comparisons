package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23461 {
    private final Productionnull_23461 production = new Productionnull_23461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}