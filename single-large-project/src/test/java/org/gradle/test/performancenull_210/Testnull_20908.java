package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20908 {
    private final Productionnull_20908 production = new Productionnull_20908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}