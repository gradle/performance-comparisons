package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14954 {
    private final Productionnull_14954 production = new Productionnull_14954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}