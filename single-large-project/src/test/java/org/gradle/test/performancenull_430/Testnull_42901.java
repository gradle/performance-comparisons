package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42901 {
    private final Productionnull_42901 production = new Productionnull_42901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}