package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40089 {
    private final Productionnull_40089 production = new Productionnull_40089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}