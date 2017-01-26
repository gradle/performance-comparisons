package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17182 {
    private final Productionnull_17182 production = new Productionnull_17182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}