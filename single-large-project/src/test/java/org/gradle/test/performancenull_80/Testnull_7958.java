package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7958 {
    private final Productionnull_7958 production = new Productionnull_7958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}