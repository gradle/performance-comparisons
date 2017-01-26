package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42203 {
    private final Productionnull_42203 production = new Productionnull_42203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}