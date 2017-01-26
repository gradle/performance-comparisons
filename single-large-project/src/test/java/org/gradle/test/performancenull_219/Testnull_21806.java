package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21806 {
    private final Productionnull_21806 production = new Productionnull_21806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}