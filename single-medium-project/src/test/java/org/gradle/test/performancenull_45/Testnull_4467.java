package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4467 {
    private final Productionnull_4467 production = new Productionnull_4467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}