package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40864 {
    private final Productionnull_40864 production = new Productionnull_40864("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}