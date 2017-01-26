package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8046 {
    private final Productionnull_8046 production = new Productionnull_8046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}