package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40836 {
    private final Productionnull_40836 production = new Productionnull_40836("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}