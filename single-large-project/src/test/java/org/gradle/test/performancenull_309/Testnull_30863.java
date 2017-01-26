package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30863 {
    private final Productionnull_30863 production = new Productionnull_30863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}