package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8097 {
    private final Productionnull_8097 production = new Productionnull_8097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}