package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30645 {
    private final Productionnull_30645 production = new Productionnull_30645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}