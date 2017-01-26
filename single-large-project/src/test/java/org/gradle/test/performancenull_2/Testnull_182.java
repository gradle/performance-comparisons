package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_182 {
    private final Productionnull_182 production = new Productionnull_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}