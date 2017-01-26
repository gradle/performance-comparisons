package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27485 {
    private final Productionnull_27485 production = new Productionnull_27485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}