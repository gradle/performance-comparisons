package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34103 {
    private final Productionnull_34103 production = new Productionnull_34103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}