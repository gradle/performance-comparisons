package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8001 {
    private final Productionnull_8001 production = new Productionnull_8001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}