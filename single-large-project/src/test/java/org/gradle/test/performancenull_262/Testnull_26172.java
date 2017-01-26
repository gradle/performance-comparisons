package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26172 {
    private final Productionnull_26172 production = new Productionnull_26172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}