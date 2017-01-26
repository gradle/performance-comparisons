package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25183 {
    private final Productionnull_25183 production = new Productionnull_25183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}