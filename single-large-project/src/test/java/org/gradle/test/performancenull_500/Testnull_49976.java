package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49976 {
    private final Productionnull_49976 production = new Productionnull_49976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}