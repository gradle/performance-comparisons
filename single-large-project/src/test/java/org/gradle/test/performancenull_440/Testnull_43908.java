package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43908 {
    private final Productionnull_43908 production = new Productionnull_43908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}