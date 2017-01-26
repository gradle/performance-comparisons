package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1570 {
    private final Productionnull_1570 production = new Productionnull_1570("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}