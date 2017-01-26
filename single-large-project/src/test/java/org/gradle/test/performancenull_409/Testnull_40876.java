package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40876 {
    private final Productionnull_40876 production = new Productionnull_40876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}