package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49909 {
    private final Productionnull_49909 production = new Productionnull_49909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}