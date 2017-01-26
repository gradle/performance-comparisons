package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25186 {
    private final Productionnull_25186 production = new Productionnull_25186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}