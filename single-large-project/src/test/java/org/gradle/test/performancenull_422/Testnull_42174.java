package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42174 {
    private final Productionnull_42174 production = new Productionnull_42174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}