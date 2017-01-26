package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38582 {
    private final Productionnull_38582 production = new Productionnull_38582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}