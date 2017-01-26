package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22496 {
    private final Productionnull_22496 production = new Productionnull_22496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}