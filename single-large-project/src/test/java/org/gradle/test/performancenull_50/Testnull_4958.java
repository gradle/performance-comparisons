package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4958 {
    private final Productionnull_4958 production = new Productionnull_4958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}