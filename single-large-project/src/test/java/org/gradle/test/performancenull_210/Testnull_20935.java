package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20935 {
    private final Productionnull_20935 production = new Productionnull_20935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}