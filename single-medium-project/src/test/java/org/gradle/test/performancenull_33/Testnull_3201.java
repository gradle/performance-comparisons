package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3201 {
    private final Productionnull_3201 production = new Productionnull_3201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}