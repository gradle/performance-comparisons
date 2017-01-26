package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42008 {
    private final Productionnull_42008 production = new Productionnull_42008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}