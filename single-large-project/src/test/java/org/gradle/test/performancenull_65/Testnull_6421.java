package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6421 {
    private final Productionnull_6421 production = new Productionnull_6421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}