package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49945 {
    private final Productionnull_49945 production = new Productionnull_49945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}