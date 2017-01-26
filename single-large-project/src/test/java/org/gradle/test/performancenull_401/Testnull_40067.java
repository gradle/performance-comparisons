package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40067 {
    private final Productionnull_40067 production = new Productionnull_40067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}