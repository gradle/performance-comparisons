package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40007 {
    private final Productionnull_40007 production = new Productionnull_40007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}