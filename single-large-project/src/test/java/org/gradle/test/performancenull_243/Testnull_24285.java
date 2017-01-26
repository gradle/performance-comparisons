package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24285 {
    private final Productionnull_24285 production = new Productionnull_24285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}