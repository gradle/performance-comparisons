package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30041 {
    private final Productionnull_30041 production = new Productionnull_30041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}