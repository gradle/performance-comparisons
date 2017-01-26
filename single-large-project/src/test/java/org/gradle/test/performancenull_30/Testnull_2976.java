package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2976 {
    private final Productionnull_2976 production = new Productionnull_2976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}