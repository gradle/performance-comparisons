package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2779 {
    private final Productionnull_2779 production = new Productionnull_2779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}