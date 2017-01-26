package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1592 {
    private final Productionnull_1592 production = new Productionnull_1592("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}