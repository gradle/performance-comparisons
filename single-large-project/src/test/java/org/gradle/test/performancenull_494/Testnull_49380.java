package org.gradle.test.performancenull_494;

import static org.junit.Assert.*;

public class Testnull_49380 {
    private final Productionnull_49380 production = new Productionnull_49380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}