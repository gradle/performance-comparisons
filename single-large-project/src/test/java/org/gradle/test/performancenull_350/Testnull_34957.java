package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34957 {
    private final Productionnull_34957 production = new Productionnull_34957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}