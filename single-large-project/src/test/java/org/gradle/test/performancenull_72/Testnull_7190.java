package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7190 {
    private final Productionnull_7190 production = new Productionnull_7190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}