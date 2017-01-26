package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22264 {
    private final Productionnull_22264 production = new Productionnull_22264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}