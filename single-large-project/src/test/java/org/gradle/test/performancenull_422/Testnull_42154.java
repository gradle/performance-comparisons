package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42154 {
    private final Productionnull_42154 production = new Productionnull_42154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}