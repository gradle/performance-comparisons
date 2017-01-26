package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40823 {
    private final Productionnull_40823 production = new Productionnull_40823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}