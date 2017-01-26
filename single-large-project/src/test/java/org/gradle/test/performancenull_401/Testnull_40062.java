package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40062 {
    private final Productionnull_40062 production = new Productionnull_40062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}