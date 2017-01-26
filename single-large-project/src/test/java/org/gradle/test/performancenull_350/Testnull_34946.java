package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34946 {
    private final Productionnull_34946 production = new Productionnull_34946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}