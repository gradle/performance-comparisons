package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42070 {
    private final Productionnull_42070 production = new Productionnull_42070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}