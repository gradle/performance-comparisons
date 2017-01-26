package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8084 {
    private final Productionnull_8084 production = new Productionnull_8084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}