package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40122 {
    private final Productionnull_40122 production = new Productionnull_40122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}