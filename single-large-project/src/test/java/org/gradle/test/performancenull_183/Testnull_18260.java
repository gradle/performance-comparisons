package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18260 {
    private final Productionnull_18260 production = new Productionnull_18260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}