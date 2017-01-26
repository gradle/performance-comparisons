package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36074 {
    private final Productionnull_36074 production = new Productionnull_36074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}