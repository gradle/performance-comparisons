package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4109 {
    private final Productionnull_4109 production = new Productionnull_4109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}