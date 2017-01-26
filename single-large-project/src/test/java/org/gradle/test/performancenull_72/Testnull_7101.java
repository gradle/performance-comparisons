package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7101 {
    private final Productionnull_7101 production = new Productionnull_7101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}