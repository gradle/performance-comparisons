package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30872 {
    private final Productionnull_30872 production = new Productionnull_30872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}