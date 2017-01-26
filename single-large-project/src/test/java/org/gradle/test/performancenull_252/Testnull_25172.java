package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25172 {
    private final Productionnull_25172 production = new Productionnull_25172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}