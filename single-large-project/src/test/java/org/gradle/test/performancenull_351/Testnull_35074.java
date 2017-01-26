package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35074 {
    private final Productionnull_35074 production = new Productionnull_35074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}