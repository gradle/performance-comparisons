package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33582 {
    private final Productionnull_33582 production = new Productionnull_33582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}