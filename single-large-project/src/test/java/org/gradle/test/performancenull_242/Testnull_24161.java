package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24161 {
    private final Productionnull_24161 production = new Productionnull_24161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}