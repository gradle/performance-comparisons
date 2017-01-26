package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30201 {
    private final Productionnull_30201 production = new Productionnull_30201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}