package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24156 {
    private final Productionnull_24156 production = new Productionnull_24156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}