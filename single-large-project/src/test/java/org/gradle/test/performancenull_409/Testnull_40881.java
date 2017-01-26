package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40881 {
    private final Productionnull_40881 production = new Productionnull_40881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}