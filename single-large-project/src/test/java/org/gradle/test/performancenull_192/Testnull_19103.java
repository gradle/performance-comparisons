package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19103 {
    private final Productionnull_19103 production = new Productionnull_19103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}