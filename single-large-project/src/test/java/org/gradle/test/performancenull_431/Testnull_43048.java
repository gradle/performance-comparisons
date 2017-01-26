package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43048 {
    private final Productionnull_43048 production = new Productionnull_43048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}