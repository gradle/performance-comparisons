package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2138 {
    private final Productionnull_2138 production = new Productionnull_2138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}