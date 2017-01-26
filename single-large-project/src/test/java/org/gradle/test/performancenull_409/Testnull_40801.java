package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40801 {
    private final Productionnull_40801 production = new Productionnull_40801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}