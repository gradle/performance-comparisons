package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4138 {
    private final Productionnull_4138 production = new Productionnull_4138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}