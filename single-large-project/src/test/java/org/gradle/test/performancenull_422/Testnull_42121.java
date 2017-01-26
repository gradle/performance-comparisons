package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42121 {
    private final Productionnull_42121 production = new Productionnull_42121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}