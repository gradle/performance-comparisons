package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30832 {
    private final Productionnull_30832 production = new Productionnull_30832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}