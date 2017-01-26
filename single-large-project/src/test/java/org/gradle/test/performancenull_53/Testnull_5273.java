package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5273 {
    private final Productionnull_5273 production = new Productionnull_5273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}