package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8089 {
    private final Productionnull_8089 production = new Productionnull_8089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}