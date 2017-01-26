package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7086 {
    private final Productionnull_7086 production = new Productionnull_7086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}