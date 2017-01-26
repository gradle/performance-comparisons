package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2181 {
    private final Productionnull_2181 production = new Productionnull_2181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}