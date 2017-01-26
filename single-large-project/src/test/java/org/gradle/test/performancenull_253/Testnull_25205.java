package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25205 {
    private final Productionnull_25205 production = new Productionnull_25205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}