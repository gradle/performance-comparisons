package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42976 {
    private final Productionnull_42976 production = new Productionnull_42976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}