package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40815 {
    private final Productionnull_40815 production = new Productionnull_40815("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}