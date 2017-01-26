package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47935 {
    private final Productionnull_47935 production = new Productionnull_47935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}