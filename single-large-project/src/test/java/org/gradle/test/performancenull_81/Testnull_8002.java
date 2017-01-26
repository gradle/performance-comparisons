package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8002 {
    private final Productionnull_8002 production = new Productionnull_8002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}