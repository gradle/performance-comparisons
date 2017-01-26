package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7934 {
    private final Productionnull_7934 production = new Productionnull_7934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}