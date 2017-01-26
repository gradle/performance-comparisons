package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17401 {
    private final Productionnull_17401 production = new Productionnull_17401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}