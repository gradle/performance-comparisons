package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23930 {
    private final Productionnull_23930 production = new Productionnull_23930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}