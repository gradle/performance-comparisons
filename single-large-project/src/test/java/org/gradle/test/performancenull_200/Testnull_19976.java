package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19976 {
    private final Productionnull_19976 production = new Productionnull_19976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}