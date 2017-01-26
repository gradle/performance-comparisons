package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27455 {
    private final Productionnull_27455 production = new Productionnull_27455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}