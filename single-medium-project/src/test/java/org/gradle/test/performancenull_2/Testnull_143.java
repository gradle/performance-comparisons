package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_143 {
    private final Productionnull_143 production = new Productionnull_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}