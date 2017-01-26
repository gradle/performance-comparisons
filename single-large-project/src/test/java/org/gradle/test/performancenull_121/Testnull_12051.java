package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12051 {
    private final Productionnull_12051 production = new Productionnull_12051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}