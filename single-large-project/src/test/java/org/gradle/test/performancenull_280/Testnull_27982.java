package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27982 {
    private final Productionnull_27982 production = new Productionnull_27982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}