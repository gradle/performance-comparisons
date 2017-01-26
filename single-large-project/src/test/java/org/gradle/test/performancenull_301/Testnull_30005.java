package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30005 {
    private final Productionnull_30005 production = new Productionnull_30005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}