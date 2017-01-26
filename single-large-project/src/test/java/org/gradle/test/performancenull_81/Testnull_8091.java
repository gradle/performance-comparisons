package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8091 {
    private final Productionnull_8091 production = new Productionnull_8091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}