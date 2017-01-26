package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21207 {
    private final Productionnull_21207 production = new Productionnull_21207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}