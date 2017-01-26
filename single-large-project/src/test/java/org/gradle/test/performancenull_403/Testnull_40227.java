package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40227 {
    private final Productionnull_40227 production = new Productionnull_40227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}