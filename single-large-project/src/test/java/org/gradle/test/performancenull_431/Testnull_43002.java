package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43002 {
    private final Productionnull_43002 production = new Productionnull_43002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}