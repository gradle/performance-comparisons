package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33203 {
    private final Productionnull_33203 production = new Productionnull_33203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}