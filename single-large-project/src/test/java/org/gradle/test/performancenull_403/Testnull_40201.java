package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40201 {
    private final Productionnull_40201 production = new Productionnull_40201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}