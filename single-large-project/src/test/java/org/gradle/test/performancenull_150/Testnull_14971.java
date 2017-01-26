package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14971 {
    private final Productionnull_14971 production = new Productionnull_14971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}