package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28085 {
    private final Productionnull_28085 production = new Productionnull_28085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}