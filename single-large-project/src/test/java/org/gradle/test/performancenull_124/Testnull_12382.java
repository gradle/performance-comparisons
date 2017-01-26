package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12382 {
    private final Productionnull_12382 production = new Productionnull_12382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}