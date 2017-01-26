package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7969 {
    private final Productionnull_7969 production = new Productionnull_7969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}