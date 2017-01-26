package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21099 {
    private final Productionnull_21099 production = new Productionnull_21099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}