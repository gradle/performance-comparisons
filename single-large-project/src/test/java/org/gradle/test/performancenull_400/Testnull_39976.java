package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39976 {
    private final Productionnull_39976 production = new Productionnull_39976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}