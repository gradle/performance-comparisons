package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4946 {
    private final Productionnull_4946 production = new Productionnull_4946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}