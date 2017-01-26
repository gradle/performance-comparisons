package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_81 {
    private final Productionnull_81 production = new Productionnull_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}