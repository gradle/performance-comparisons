package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30879 {
    private final Productionnull_30879 production = new Productionnull_30879("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}