package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5293 {
    private final Productionnull_5293 production = new Productionnull_5293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}