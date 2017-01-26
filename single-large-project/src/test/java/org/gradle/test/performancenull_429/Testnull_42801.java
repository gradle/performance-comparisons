package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42801 {
    private final Productionnull_42801 production = new Productionnull_42801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}