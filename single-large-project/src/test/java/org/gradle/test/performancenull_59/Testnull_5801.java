package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5801 {
    private final Productionnull_5801 production = new Productionnull_5801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}