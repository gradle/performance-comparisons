package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12935 {
    private final Productionnull_12935 production = new Productionnull_12935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}