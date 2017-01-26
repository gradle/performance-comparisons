package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30842 {
    private final Productionnull_30842 production = new Productionnull_30842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}