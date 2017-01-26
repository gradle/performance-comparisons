package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2969 {
    private final Productionnull_2969 production = new Productionnull_2969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}