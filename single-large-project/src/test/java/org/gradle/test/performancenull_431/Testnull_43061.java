package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43061 {
    private final Productionnull_43061 production = new Productionnull_43061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}