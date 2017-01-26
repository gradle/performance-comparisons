package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19146 {
    private final Productionnull_19146 production = new Productionnull_19146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}