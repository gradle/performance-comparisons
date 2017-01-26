package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42421 {
    private final Productionnull_42421 production = new Productionnull_42421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}