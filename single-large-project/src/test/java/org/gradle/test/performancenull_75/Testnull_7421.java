package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7421 {
    private final Productionnull_7421 production = new Productionnull_7421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}