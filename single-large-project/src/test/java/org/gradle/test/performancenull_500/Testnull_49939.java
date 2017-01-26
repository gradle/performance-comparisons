package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49939 {
    private final Productionnull_49939 production = new Productionnull_49939("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}