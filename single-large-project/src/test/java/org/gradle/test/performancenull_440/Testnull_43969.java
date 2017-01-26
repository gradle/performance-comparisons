package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43969 {
    private final Productionnull_43969 production = new Productionnull_43969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}