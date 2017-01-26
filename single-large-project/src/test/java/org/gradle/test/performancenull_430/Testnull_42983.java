package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42983 {
    private final Productionnull_42983 production = new Productionnull_42983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}