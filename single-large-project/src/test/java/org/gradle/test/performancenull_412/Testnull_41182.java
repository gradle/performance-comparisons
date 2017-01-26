package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41182 {
    private final Productionnull_41182 production = new Productionnull_41182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}