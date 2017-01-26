package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43064 {
    private final Productionnull_43064 production = new Productionnull_43064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}