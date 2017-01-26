package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43083 {
    private final Productionnull_43083 production = new Productionnull_43083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}