package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43063 {
    private final Productionnull_43063 production = new Productionnull_43063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}