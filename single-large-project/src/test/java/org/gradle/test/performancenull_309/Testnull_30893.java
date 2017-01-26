package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30893 {
    private final Productionnull_30893 production = new Productionnull_30893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}