package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8099 {
    private final Productionnull_8099 production = new Productionnull_8099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}