package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22929 {
    private final Productionnull_22929 production = new Productionnull_22929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}