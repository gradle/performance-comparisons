package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19987 {
    private final Productionnull_19987 production = new Productionnull_19987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}