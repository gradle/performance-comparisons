package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40058 {
    private final Productionnull_40058 production = new Productionnull_40058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}