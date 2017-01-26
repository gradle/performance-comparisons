package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43078 {
    private final Productionnull_43078 production = new Productionnull_43078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}