package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36085 {
    private final Productionnull_36085 production = new Productionnull_36085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}