package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8031 {
    private final Productionnull_8031 production = new Productionnull_8031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}