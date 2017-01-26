package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42098 {
    private final Productionnull_42098 production = new Productionnull_42098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}