package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19932 {
    private final Productionnull_19932 production = new Productionnull_19932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}