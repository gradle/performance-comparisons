package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3071 {
    private final Productionnull_3071 production = new Productionnull_3071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}