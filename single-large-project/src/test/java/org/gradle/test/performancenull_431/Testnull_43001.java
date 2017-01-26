package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43001 {
    private final Productionnull_43001 production = new Productionnull_43001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}