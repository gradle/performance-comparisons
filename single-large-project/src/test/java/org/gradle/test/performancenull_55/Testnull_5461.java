package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5461 {
    private final Productionnull_5461 production = new Productionnull_5461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}