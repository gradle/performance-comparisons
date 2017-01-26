package org.gradle.test.performancenull_152;

import static org.junit.Assert.*;

public class Testnull_15190 {
    private final Productionnull_15190 production = new Productionnull_15190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}