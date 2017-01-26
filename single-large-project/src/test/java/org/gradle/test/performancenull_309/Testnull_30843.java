package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30843 {
    private final Productionnull_30843 production = new Productionnull_30843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}