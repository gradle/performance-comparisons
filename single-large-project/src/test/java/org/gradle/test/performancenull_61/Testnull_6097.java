package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6097 {
    private final Productionnull_6097 production = new Productionnull_6097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}