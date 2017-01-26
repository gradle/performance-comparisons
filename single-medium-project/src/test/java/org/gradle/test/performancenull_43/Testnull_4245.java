package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4245 {
    private final Productionnull_4245 production = new Productionnull_4245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}