package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22421 {
    private final Productionnull_22421 production = new Productionnull_22421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}