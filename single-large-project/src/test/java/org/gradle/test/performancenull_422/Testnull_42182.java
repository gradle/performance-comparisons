package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42182 {
    private final Productionnull_42182 production = new Productionnull_42182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}