package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8053 {
    private final Productionnull_8053 production = new Productionnull_8053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}