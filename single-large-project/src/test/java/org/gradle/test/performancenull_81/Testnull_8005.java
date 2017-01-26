package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8005 {
    private final Productionnull_8005 production = new Productionnull_8005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}