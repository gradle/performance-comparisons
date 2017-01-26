package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42088 {
    private final Productionnull_42088 production = new Productionnull_42088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}