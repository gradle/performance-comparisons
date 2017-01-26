package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42566 {
    private final Productionnull_42566 production = new Productionnull_42566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}