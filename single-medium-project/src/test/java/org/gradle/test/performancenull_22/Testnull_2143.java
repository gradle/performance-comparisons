package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2143 {
    private final Productionnull_2143 production = new Productionnull_2143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}