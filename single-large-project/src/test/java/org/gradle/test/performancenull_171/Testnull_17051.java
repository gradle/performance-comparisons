package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17051 {
    private final Productionnull_17051 production = new Productionnull_17051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}