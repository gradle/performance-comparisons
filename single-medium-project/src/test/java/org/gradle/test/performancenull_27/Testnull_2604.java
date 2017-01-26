package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2604 {
    private final Productionnull_2604 production = new Productionnull_2604("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}