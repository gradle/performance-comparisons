package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31935 {
    private final Productionnull_31935 production = new Productionnull_31935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}