package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35502 {
    private final Productionnull_35502 production = new Productionnull_35502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}