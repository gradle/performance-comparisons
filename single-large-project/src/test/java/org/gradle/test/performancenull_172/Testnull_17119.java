package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17119 {
    private final Productionnull_17119 production = new Productionnull_17119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}