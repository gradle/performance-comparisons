package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22908 {
    private final Productionnull_22908 production = new Productionnull_22908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}