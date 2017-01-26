package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27461 {
    private final Productionnull_27461 production = new Productionnull_27461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}