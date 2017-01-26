package org.gradle.test.performancenull_318;

import static org.junit.Assert.*;

public class Testnull_31702 {
    private final Productionnull_31702 production = new Productionnull_31702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}