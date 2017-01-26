package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5226 {
    private final Productionnull_5226 production = new Productionnull_5226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}