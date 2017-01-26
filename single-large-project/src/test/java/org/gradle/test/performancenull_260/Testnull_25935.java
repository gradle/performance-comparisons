package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25935 {
    private final Productionnull_25935 production = new Productionnull_25935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}