package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20605 {
    private final Productionnull_20605 production = new Productionnull_20605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}