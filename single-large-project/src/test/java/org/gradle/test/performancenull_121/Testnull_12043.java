package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12043 {
    private final Productionnull_12043 production = new Productionnull_12043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}