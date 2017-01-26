package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2418 {
    private final Productionnull_2418 production = new Productionnull_2418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}