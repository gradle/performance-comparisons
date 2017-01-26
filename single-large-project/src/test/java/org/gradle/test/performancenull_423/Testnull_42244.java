package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42244 {
    private final Productionnull_42244 production = new Productionnull_42244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}