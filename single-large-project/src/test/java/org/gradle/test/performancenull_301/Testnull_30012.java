package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30012 {
    private final Productionnull_30012 production = new Productionnull_30012("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}