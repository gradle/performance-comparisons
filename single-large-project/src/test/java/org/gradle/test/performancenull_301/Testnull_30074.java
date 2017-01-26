package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30074 {
    private final Productionnull_30074 production = new Productionnull_30074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}