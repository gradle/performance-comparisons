package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40059 {
    private final Productionnull_40059 production = new Productionnull_40059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}