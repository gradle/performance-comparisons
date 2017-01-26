package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7480 {
    private final Productionnull_7480 production = new Productionnull_7480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}