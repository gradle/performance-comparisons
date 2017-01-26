package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7445 {
    private final Productionnull_7445 production = new Productionnull_7445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}