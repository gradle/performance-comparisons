package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43965 {
    private final Productionnull_43965 production = new Productionnull_43965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}