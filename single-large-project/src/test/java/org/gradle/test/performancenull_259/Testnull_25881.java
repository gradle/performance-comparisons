package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25881 {
    private final Productionnull_25881 production = new Productionnull_25881("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}