package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5262 {
    private final Productionnull_5262 production = new Productionnull_5262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}