package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42205 {
    private final Productionnull_42205 production = new Productionnull_42205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}