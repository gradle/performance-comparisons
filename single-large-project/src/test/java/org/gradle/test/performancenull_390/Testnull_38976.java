package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38976 {
    private final Productionnull_38976 production = new Productionnull_38976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}