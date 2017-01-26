package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42030 {
    private final Productionnull_42030 production = new Productionnull_42030("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}