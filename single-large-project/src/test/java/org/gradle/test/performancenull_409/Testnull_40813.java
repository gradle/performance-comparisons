package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40813 {
    private final Productionnull_40813 production = new Productionnull_40813("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}