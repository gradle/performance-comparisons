package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17165 {
    private final Productionnull_17165 production = new Productionnull_17165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}