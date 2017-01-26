package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35908 {
    private final Productionnull_35908 production = new Productionnull_35908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}