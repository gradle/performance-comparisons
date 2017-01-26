package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8070 {
    private final Productionnull_8070 production = new Productionnull_8070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}