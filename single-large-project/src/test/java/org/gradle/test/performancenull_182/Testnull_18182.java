package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18182 {
    private final Productionnull_18182 production = new Productionnull_18182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}