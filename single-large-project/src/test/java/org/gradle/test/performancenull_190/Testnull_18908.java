package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18908 {
    private final Productionnull_18908 production = new Productionnull_18908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}