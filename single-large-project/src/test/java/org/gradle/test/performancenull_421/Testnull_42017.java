package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42017 {
    private final Productionnull_42017 production = new Productionnull_42017("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}