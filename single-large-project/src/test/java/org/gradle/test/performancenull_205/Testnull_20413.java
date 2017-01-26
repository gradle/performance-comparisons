package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20413 {
    private final Productionnull_20413 production = new Productionnull_20413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}