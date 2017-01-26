package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42129 {
    private final Productionnull_42129 production = new Productionnull_42129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}