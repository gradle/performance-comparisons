package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40883 {
    private final Productionnull_40883 production = new Productionnull_40883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}