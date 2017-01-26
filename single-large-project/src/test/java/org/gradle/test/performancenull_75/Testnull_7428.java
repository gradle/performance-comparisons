package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7428 {
    private final Productionnull_7428 production = new Productionnull_7428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}