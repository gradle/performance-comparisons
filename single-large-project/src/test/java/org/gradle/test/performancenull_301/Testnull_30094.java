package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30094 {
    private final Productionnull_30094 production = new Productionnull_30094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}