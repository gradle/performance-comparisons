package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49181 {
    private final Productionnull_49181 production = new Productionnull_49181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}