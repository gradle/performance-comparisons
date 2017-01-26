package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17081 {
    private final Productionnull_17081 production = new Productionnull_17081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}