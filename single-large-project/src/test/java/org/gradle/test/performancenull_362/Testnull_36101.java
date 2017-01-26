package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36101 {
    private final Productionnull_36101 production = new Productionnull_36101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}