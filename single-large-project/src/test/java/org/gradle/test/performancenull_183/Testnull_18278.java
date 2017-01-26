package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18278 {
    private final Productionnull_18278 production = new Productionnull_18278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}