package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1955 {
    private final Productionnull_1955 production = new Productionnull_1955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}