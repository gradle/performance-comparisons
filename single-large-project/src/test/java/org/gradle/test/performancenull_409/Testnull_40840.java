package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40840 {
    private final Productionnull_40840 production = new Productionnull_40840("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}