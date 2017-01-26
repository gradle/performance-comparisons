package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37051 {
    private final Productionnull_37051 production = new Productionnull_37051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}