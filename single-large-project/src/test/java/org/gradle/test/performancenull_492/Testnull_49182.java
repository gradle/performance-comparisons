package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49182 {
    private final Productionnull_49182 production = new Productionnull_49182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}