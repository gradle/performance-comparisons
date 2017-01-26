package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36066 {
    private final Productionnull_36066 production = new Productionnull_36066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}