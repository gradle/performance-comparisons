package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7147 {
    private final Productionnull_7147 production = new Productionnull_7147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}