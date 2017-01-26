package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30098 {
    private final Productionnull_30098 production = new Productionnull_30098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}