package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43031 {
    private final Productionnull_43031 production = new Productionnull_43031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}