package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4878 {
    private final Productionnull_4878 production = new Productionnull_4878("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}