package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12058 {
    private final Productionnull_12058 production = new Productionnull_12058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}