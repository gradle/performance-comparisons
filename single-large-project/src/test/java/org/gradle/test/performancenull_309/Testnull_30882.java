package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30882 {
    private final Productionnull_30882 production = new Productionnull_30882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}