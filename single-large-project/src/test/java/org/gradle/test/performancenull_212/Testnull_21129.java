package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21129 {
    private final Productionnull_21129 production = new Productionnull_21129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}