package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13074 {
    private final Productionnull_13074 production = new Productionnull_13074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}