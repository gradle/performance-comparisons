package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42005 {
    private final Productionnull_42005 production = new Productionnull_42005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}