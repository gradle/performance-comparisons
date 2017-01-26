package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_190 {
    private final Productionnull_190 production = new Productionnull_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}