package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42221 {
    private final Productionnull_42221 production = new Productionnull_42221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}