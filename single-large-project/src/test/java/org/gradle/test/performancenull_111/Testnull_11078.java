package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11078 {
    private final Productionnull_11078 production = new Productionnull_11078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}