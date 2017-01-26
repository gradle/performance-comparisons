package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30891 {
    private final Productionnull_30891 production = new Productionnull_30891("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}