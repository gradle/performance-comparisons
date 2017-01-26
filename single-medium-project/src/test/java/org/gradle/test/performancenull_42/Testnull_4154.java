package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4154 {
    private final Productionnull_4154 production = new Productionnull_4154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}