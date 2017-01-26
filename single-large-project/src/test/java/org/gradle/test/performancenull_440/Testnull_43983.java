package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43983 {
    private final Productionnull_43983 production = new Productionnull_43983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}