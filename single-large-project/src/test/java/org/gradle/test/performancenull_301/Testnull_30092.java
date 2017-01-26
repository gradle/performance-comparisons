package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30092 {
    private final Productionnull_30092 production = new Productionnull_30092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}