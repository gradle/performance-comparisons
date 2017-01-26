package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33426 {
    private final Productionnull_33426 production = new Productionnull_33426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}