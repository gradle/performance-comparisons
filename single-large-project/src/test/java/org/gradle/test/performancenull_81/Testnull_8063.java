package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8063 {
    private final Productionnull_8063 production = new Productionnull_8063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}