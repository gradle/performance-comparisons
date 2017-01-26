package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3508 {
    private final Productionnull_3508 production = new Productionnull_3508("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}