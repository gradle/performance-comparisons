package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46182 {
    private final Productionnull_46182 production = new Productionnull_46182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}