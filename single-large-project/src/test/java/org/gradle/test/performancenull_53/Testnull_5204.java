package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5204 {
    private final Productionnull_5204 production = new Productionnull_5204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}