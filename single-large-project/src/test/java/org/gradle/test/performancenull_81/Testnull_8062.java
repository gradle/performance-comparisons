package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8062 {
    private final Productionnull_8062 production = new Productionnull_8062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}