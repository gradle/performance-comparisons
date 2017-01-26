package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42572 {
    private final Productionnull_42572 production = new Productionnull_42572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}