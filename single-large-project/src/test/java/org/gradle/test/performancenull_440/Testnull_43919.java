package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43919 {
    private final Productionnull_43919 production = new Productionnull_43919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}