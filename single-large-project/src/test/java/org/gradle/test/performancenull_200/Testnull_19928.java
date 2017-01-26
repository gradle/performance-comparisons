package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19928 {
    private final Productionnull_19928 production = new Productionnull_19928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}