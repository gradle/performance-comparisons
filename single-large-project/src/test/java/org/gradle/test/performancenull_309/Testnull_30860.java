package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30860 {
    private final Productionnull_30860 production = new Productionnull_30860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}