package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30002 {
    private final Productionnull_30002 production = new Productionnull_30002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}