package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40046 {
    private final Productionnull_40046 production = new Productionnull_40046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}