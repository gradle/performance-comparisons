package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40051 {
    private final Productionnull_40051 production = new Productionnull_40051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}