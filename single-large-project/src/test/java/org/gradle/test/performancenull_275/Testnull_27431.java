package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27431 {
    private final Productionnull_27431 production = new Productionnull_27431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}