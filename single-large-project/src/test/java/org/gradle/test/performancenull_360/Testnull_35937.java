package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35937 {
    private final Productionnull_35937 production = new Productionnull_35937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}