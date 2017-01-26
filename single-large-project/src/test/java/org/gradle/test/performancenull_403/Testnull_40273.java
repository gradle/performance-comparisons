package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40273 {
    private final Productionnull_40273 production = new Productionnull_40273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}