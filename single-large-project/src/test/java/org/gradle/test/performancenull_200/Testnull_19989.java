package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19989 {
    private final Productionnull_19989 production = new Productionnull_19989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}