package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27471 {
    private final Productionnull_27471 production = new Productionnull_27471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}