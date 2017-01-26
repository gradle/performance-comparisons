package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43086 {
    private final Productionnull_43086 production = new Productionnull_43086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}