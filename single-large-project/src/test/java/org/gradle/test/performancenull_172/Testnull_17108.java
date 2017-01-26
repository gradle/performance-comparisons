package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17108 {
    private final Productionnull_17108 production = new Productionnull_17108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}