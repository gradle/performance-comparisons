package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11976 {
    private final Productionnull_11976 production = new Productionnull_11976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}