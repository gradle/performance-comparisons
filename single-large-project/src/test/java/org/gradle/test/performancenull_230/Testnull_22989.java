package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22989 {
    private final Productionnull_22989 production = new Productionnull_22989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}