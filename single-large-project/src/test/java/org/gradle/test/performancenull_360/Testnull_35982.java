package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35982 {
    private final Productionnull_35982 production = new Productionnull_35982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}