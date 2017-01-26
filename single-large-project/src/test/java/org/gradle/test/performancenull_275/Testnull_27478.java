package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27478 {
    private final Productionnull_27478 production = new Productionnull_27478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}