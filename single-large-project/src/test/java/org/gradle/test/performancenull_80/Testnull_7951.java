package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7951 {
    private final Productionnull_7951 production = new Productionnull_7951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}