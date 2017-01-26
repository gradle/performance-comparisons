package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16051 {
    private final Productionnull_16051 production = new Productionnull_16051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}