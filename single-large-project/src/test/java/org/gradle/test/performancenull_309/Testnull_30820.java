package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30820 {
    private final Productionnull_30820 production = new Productionnull_30820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}