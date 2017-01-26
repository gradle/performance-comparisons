package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17101 {
    private final Productionnull_17101 production = new Productionnull_17101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}