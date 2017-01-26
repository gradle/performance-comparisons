package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40064 {
    private final Productionnull_40064 production = new Productionnull_40064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}