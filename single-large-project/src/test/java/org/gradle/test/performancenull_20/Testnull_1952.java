package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1952 {
    private final Productionnull_1952 production = new Productionnull_1952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}