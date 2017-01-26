package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17103 {
    private final Productionnull_17103 production = new Productionnull_17103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}