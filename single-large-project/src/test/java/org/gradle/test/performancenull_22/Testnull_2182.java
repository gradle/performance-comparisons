package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2182 {
    private final Productionnull_2182 production = new Productionnull_2182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}