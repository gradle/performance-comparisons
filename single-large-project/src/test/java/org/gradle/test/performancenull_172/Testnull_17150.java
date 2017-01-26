package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17150 {
    private final Productionnull_17150 production = new Productionnull_17150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}