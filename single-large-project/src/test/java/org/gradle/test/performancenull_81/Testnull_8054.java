package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8054 {
    private final Productionnull_8054 production = new Productionnull_8054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}