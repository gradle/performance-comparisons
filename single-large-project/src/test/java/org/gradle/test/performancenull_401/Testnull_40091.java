package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40091 {
    private final Productionnull_40091 production = new Productionnull_40091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}