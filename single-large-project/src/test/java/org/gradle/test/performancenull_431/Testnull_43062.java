package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43062 {
    private final Productionnull_43062 production = new Productionnull_43062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}