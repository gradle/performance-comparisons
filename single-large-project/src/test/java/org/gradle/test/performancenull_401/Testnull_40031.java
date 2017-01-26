package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40031 {
    private final Productionnull_40031 production = new Productionnull_40031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}