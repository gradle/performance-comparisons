package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42256 {
    private final Productionnull_42256 production = new Productionnull_42256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}