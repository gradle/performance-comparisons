package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39950 {
    private final Productionnull_39950 production = new Productionnull_39950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}