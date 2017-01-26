package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4129 {
    private final Productionnull_4129 production = new Productionnull_4129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}