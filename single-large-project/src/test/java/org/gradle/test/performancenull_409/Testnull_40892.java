package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40892 {
    private final Productionnull_40892 production = new Productionnull_40892("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}