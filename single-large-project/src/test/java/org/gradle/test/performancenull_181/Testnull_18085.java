package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18085 {
    private final Productionnull_18085 production = new Productionnull_18085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}