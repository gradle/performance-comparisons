package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37227 {
    private final Productionnull_37227 production = new Productionnull_37227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}