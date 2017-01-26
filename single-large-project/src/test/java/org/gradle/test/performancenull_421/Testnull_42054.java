package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42054 {
    private final Productionnull_42054 production = new Productionnull_42054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}