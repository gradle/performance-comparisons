package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42908 {
    private final Productionnull_42908 production = new Productionnull_42908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}