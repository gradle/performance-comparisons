package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17109 {
    private final Productionnull_17109 production = new Productionnull_17109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}