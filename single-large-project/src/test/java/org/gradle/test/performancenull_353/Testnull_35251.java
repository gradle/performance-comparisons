package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35251 {
    private final Productionnull_35251 production = new Productionnull_35251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}