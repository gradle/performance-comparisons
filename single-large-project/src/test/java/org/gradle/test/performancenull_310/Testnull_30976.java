package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30976 {
    private final Productionnull_30976 production = new Productionnull_30976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}