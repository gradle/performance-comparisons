package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4976 {
    private final Productionnull_4976 production = new Productionnull_4976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}