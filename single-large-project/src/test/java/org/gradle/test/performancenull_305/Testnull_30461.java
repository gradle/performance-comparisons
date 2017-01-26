package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30461 {
    private final Productionnull_30461 production = new Productionnull_30461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}