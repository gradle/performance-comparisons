package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23935 {
    private final Productionnull_23935 production = new Productionnull_23935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}