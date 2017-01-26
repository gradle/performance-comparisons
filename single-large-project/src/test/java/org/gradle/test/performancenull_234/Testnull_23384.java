package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23384 {
    private final Productionnull_23384 production = new Productionnull_23384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}