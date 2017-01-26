package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23929 {
    private final Productionnull_23929 production = new Productionnull_23929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}