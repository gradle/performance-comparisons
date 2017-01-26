package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40858 {
    private final Productionnull_40858 production = new Productionnull_40858("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}