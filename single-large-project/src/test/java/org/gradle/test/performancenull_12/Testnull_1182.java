package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1182 {
    private final Productionnull_1182 production = new Productionnull_1182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}