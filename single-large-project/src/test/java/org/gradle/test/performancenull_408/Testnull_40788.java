package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40788 {
    private final Productionnull_40788 production = new Productionnull_40788("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}