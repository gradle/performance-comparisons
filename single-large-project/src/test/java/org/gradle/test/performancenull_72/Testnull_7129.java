package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7129 {
    private final Productionnull_7129 production = new Productionnull_7129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}