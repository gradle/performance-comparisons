package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40886 {
    private final Productionnull_40886 production = new Productionnull_40886("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}