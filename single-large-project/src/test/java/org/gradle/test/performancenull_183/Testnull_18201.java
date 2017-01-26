package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18201 {
    private final Productionnull_18201 production = new Productionnull_18201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}