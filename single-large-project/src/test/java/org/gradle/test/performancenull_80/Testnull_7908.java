package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7908 {
    private final Productionnull_7908 production = new Productionnull_7908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}