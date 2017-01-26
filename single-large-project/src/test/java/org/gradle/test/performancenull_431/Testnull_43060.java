package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43060 {
    private final Productionnull_43060 production = new Productionnull_43060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}