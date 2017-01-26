package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30824 {
    private final Productionnull_30824 production = new Productionnull_30824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}