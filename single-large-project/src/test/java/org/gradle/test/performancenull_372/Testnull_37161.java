package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37161 {
    private final Productionnull_37161 production = new Productionnull_37161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}