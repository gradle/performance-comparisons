package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47201 {
    private final Productionnull_47201 production = new Productionnull_47201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}