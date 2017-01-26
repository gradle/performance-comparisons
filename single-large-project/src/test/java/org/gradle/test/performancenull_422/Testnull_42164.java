package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42164 {
    private final Productionnull_42164 production = new Productionnull_42164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}