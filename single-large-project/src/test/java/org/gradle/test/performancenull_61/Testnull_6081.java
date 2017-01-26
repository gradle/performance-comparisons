package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6081 {
    private final Productionnull_6081 production = new Productionnull_6081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}