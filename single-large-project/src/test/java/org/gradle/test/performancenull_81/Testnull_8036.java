package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8036 {
    private final Productionnull_8036 production = new Productionnull_8036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}