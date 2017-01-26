package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19905 {
    private final Productionnull_19905 production = new Productionnull_19905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}