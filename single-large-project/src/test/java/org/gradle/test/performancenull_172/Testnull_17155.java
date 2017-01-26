package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17155 {
    private final Productionnull_17155 production = new Productionnull_17155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}