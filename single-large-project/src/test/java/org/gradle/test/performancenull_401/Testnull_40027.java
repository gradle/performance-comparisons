package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40027 {
    private final Productionnull_40027 production = new Productionnull_40027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}