package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8058 {
    private final Productionnull_8058 production = new Productionnull_8058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}