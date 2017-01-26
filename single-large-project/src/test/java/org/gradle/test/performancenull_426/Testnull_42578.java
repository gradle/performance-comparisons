package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42578 {
    private final Productionnull_42578 production = new Productionnull_42578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}