package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42266 {
    private final Productionnull_42266 production = new Productionnull_42266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}