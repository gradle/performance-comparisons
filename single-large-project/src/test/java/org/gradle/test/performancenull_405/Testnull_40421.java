package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40421 {
    private final Productionnull_40421 production = new Productionnull_40421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}