package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30062 {
    private final Productionnull_30062 production = new Productionnull_30062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}