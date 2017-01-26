package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43052 {
    private final Productionnull_43052 production = new Productionnull_43052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}