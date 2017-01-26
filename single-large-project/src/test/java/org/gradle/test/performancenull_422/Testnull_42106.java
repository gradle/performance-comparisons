package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42106 {
    private final Productionnull_42106 production = new Productionnull_42106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}