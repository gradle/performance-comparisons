package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2425 {
    private final Productionnull_2425 production = new Productionnull_2425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}