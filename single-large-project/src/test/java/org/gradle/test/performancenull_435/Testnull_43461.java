package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43461 {
    private final Productionnull_43461 production = new Productionnull_43461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}