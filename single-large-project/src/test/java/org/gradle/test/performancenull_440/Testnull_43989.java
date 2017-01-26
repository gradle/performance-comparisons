package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43989 {
    private final Productionnull_43989 production = new Productionnull_43989("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}