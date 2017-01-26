package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23853 {
    private final Productionnull_23853 production = new Productionnull_23853("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}