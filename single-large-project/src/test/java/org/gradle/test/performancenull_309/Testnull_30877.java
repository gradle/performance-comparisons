package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30877 {
    private final Productionnull_30877 production = new Productionnull_30877("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}