package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20006 {
    private final Productionnull_20006 production = new Productionnull_20006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}