package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18506 {
    private final Productionnull_18506 production = new Productionnull_18506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}