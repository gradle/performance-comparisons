package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27454 {
    private final Productionnull_27454 production = new Productionnull_27454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}