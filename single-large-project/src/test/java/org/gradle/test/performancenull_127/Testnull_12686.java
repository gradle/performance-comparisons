package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12686 {
    private final Productionnull_12686 production = new Productionnull_12686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}