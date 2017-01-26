package org.gradle.test.performancenull_443;

import static org.junit.Assert.*;

public class Testnull_44285 {
    private final Productionnull_44285 production = new Productionnull_44285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}