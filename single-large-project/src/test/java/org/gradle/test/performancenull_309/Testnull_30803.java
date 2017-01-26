package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30803 {
    private final Productionnull_30803 production = new Productionnull_30803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}