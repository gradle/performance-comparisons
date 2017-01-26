package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19948 {
    private final Productionnull_19948 production = new Productionnull_19948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}