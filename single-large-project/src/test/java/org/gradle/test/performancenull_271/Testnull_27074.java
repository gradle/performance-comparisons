package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27074 {
    private final Productionnull_27074 production = new Productionnull_27074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}